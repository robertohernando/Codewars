from mult import solution

def test():
    assert solution(4) == 3
    assert solution(6) == 8
    assert solution(16) == 60
    assert solution(200) == 9168
    
def test3():
    assert solution(3) == 0
    assert solution(0) == 0
    assert solution(-1) == 0

def test5():
    assert solution(5) == 3
    
def test15():
    assert solution(15) == 45
    
