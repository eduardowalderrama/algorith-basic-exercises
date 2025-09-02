algoritmo exercise_03
    real a, b, d, A1, A2, AT
    início
        escreva("Informe o valor de a (base superior): ")
        leia(a)
        escreva("Informe o valor de b (base inferior): ")
        leia(b)
        escreva("Informe o valor de d (altura): ")
        leia(d)
        A1 = a * d
        A2 = b * d
        AT = A1 + A2
        escreva("Area do retangulo superior (A1): " + A1)
        escreva("Area do retangulo inferior (A2): " + A2)
        escreva("Area total (AT): " + AT)            
    fim