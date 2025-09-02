algoritmo exercise_05
    inteiro hour, minutes, total_minutes
    início
        escreva("Informe o hora (0 a 23): ")
        leia(hour)
        escreva("Informe os minutos (0 a 59): ")
        leia(minutes)
        total_minutes = (hour * 60) + minutes
        escreva("Ja se passaram " + total_minutes + " minutos desde o inicio do dia.")
    fim