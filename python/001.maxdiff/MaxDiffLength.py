def mxdiflg(a1, a2):
    # your code
    Max = -1
    for x in a1:
        for z in a2:
            Max = max( (abs(len(x) - len(z)),  Max) )
    return Max