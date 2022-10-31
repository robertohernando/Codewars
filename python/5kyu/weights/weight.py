# Dada una lista de números (pesos) la devuelve ordenada según la suma de sus dígitos
# En casa de igual resultado lo hará según el orden lexicográfico

import codewars_test as test

# Mi solución
def order_weight(string):
    # 0.- Si la lista es vacía, devuelvo cadena vacía
    if string == '':
        return string
    # 1.- Separo los números de la cadena, creando una lista ordenada
    numeros = string.split()
    
    # 2. Ordeno la lista alfabéticamente
    numeros.sort()

    # 2.- Calculo los pesos de cada número
    pesos = []
    for numero in numeros:
        peso = 0
        for i in numero:
            peso += int(i)
        pesos.append(peso)

    # ~~3.- Construyo un diccionario con cada número y peso~~ => ERROR -> así pierdo las entradas repetidas
    # 3.- Construyo una lista con pares de elementos: (número, peso) y ordeno por peso
    numeros_y_pesos = list(zip(*sorted(zip(numeros, pesos), key=lambda x: x[1])))

    # 4.- Devuelvo los números como una cadena de caracteres
    return(' '.join(numeros_y_pesos[0]))

  
@test.describe("Weight for weight")
def tests():
    @test.it("basic tests")
    def basics1():
        test.assert_equals(order_weight("103 123 4444 99 2000"), "2000 103 123 4444 99")
        test.assert_equals(order_weight("2000 10003 1234000 44444444 9999 11 11 22 123"), "11 11 2000 10003 22 123 1234000 44444444 9999")
        test.assert_equals(order_weight(""), "")
        

# La mejor solución de codewars
def order_weight2(_str):
    return ' '.join(sorted(sorted(_str.split(' ')), key=lambda x: sum(int(c) for c in x)))
      