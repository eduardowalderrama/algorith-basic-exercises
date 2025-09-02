algoritmo exercise_04
    real price, valor_dolar, valor_real
    início
        escreva("Informe a cotacao do dolar (R$): ")
        leia(price)
        escreva("Informe o valor em dolares (US$): ")
        leia(valor_dolar)
        valor_real = valor_dolar * price
        escreva("US$ " + dolar + " equivale a R$ " + valor_real)
    fim