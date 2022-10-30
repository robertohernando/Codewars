# string -> Boolean
#   - True: el número y orden de paréntesis es correcto
#   - False: en caso contrario
#
# restricción -> la cadena es menor de 100 caracteres

def valid_parentheses(string):
    total = 0
    # Para paréntesis a la izquierda '(' sumo uno
    # Para paréntesis a la derecha ')' resto uno
    # Si en algún momento tengo un negativo -> devuelvo False (se ha cerrado un paréntesis no abierto)
    # Si el total es 0 el orden de paréntesis es correcto, sino incorrecto
    for caracter in string:
        # Para paréntesis a la izquierda '(' sumo uno
        if caracter == '(':
            total += 1
        # Para paréntesis a la derecha ')' resto uno
        elif caracter == ')':
            total -= 1
        # Si en algún momento tengo un negativo -> devuelvo False (se ha cerrado un paréntesis no abierto)
        if total <0:
            return False
            break
    # Si el total es 0 el orden de paréntesis es correcto, sino incorrecto
    return total == 0

# Batería de tests de codewars
def test1():
    assert valid_parentheses("  (") == False

def test2():
    assert valid_parentheses(")test") == False

def test3():
    assert valid_parentheses("") == True

def test4():    
    assert valid_parentheses("hi())(") == False

def test5():
    assert valid_parentheses("hi(hi)()") == True

if __name__ == "__main__":
    test1()
    test2()
    test3()
    test4()
    test5()
    print("Pruebas pasadas")    