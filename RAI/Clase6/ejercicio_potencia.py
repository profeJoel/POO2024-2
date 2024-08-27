#print("Hola POO")

"""_summary_
este texto no se va a trabajar
De multiples lineas
"""

def potencia(b, e):
    p=1
    """
    while(e>0):
        #p = p *b
        p*=b
        e-=1
    """
    for i in range(e):
        p*=b
    return p

if __name__ == "__main__":

    print("2 elevado a 2 es " + str(2**2))
    print("2 elevado a 2 es ",2**2)
    print(f"2 elevado a 2 es {2**2}")

    base = 4
    exp = 2

    print(f"la base es {base} y el exponente es {exp}")
    print(f"La potencia es {potencia(base, exp)}")