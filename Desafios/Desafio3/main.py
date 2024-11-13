import json

# Função para calcular os dados solicitados
def analisar_faturamento(faturamento_data):
    faturamentos_validos = [f['valor'] for f in faturamento_data if f['valor'] > 0]  # Ignora os dias com faturamento 0
    total_faturamento = sum(faturamentos_validos)
    dias_com_faturamento = len(faturamentos_validos)
    media_mensal = total_faturamento / dias_com_faturamento if dias_com_faturamento > 0 else 0

    menor_faturamento = min(faturamentos_validos) if faturamentos_validos else 0
    maior_faturamento = max(faturamentos_validos) if faturamentos_validos else 0

    dias_acima_da_media = sum(1 for f in faturamento_data if f['valor'] > media_mensal)

    return menor_faturamento, maior_faturamento, dias_acima_da_media

# Função principal
def main():
    # Lendo o arquivo JSON
    with open('faturamento.json', 'r') as f:
        data = json.load(f)
    
    faturamento_data = data["faturamento"]
    
    # Calculando os valores solicitados
    menor, maior, dias_acima_media = analisar_faturamento(faturamento_data)

    # Exibindo o resultado
    print(f"Menor valor de faturamento: R$ {menor}")
    print(f"Maior valor de faturamento: R$ {maior}")
    print(f"Número de dias com faturamento acima da média: {dias_acima_media}")

# Executando o programa
if __name__ == "__main__":
    main()
