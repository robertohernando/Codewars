# Dada una cadena de texto, reemplaza cada letra por su posición en el alfabeto
# Si algo no es una letra lo ignora

# Mi solución
def alphabet_position(texto):
    letras = 'abcdefghijklmnopqrstuvwxyz'
    solucion = ''
    # 1. Obtengo cada carácter de la cadena
    for caracter in texto:
        caracter_en_minusculas = caracter.lower()
        # 2. Si no es una letra, no hago nada
        # 3. Si es una letra devuelvo su posición en el alfabeto
        if caracter_en_minusculas in letras:
            solucion = solucion + str(letras.index(caracter_en_minusculas) + 1) + ' '
    # Devuelvo la solución quitando el último carácter (que será un espacio en blanco)
    return solucion[:-1]


# Solución codewars
def alphabet_position(s):
  return " ".join(str(ord(c)-ord("a")+1) for c in s.lower() if c.isalpha())

def test1():
    assert alphabet_position('') == ''

def test_code1():
    assert alphabet_position("The sunset sets at twelve o' clock.") == "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"

def test_code2():
    assert alphabet_position("The narwhal bacons at midnight.") == "20 8 5 14 1 18 23 8 1 12 2 1 3 15 14 19 1 20 13 9 4 14 9 7 8 20"

def test2():
    assert alphabet_position("abcd") == "1 2 3 4"

def test3():
    assert alphabet_position("ABCD") == "1 2 3 4"

if __name__ == "__main__":
    test1()
    test2()
    test3()
    test_code1()
    test_code2()
    print("Pruebas pasadas")