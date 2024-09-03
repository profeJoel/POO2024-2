def gano(m,s):
    return (m[0][0]==s and m[0][1]==s and m[0][2]==s) or (m[1][0]==s and m[1][1]==s and m[1][2]==s) or (m[2][0]==s and m[2][1]==s and m[2][2]==s) or (m[0][0]==s and m[1][0]==s and m[2][0]==s) or (m[0][1]==s and m[1][1]==s and m[2][1]==s) or (m[0][2]==s and m[1][2]==s and m[2][2]==s) or (m[0][0]==s and m[1][1]==s and m[2][2]==s) or (m[0][2]==s and m[1][1]==s and m[2][0]==s)

def alguien_gano(m):
    return gano(tablero, "O") or gano(tablero, "X")

def imprimir(m):
    for i in range(3):
        for j in range(3):
            print(f"|{m[i][j]}|", end="")
        print("")

if __name__ == "__main__":
    historial = []
    tablero = [[" "," "," "],[" "," "," "],[" "," "," "]]
    print("Ingrese nombre para el jugador 'O': ")
    jugador_O = input()
    print("Ingrese nombre para el jugador 'X': ")
    jugador_X = input()

    for turno in range(9):
        if alguien_gano(tablero):
            break
        if turno%2 == 0:
            imprimir(tablero)
            print("Turno jugador 'O': ")
            print("Ingrese la fila de la matriz [0,2]: ")
            fila = int(input())
            while(fila < 0 or fila > 2):
                print("Ingrese la fila de la matriz [0,2]: ")
                fila = int(input())
            
            print("Ingrese la columna de la matriz [0,2]: ")
            columna = int(input())
            while(columna < 0 or columna > 2):
                print("Ingrese la columna de la matriz [0,2]: ")
                columna = int(input())
            
            if tablero[fila][columna] == " ":
                tablero[fila][columna] = "O"
            else:
                print("Posicion ya ocupada")
                turno -=1
        else:
            imprimir(tablero)
            print("Turno jugador 'X': ")
            print("Ingrese la fila de la matriz [0,2]: ")
            fila = int(input())
            while(fila < 0 or fila > 2):
                print("Ingrese la fila de la matriz [0,2]: ")
                fila = int(input())
            
            print("Ingrese la columna de la matriz [0,2]: ")
            columna = int(input())
            while(columna < 0 or columna > 2):
                print("Ingrese la columna de la matriz [0,2]: ")
                columna = int(input())
            
            if tablero[fila][columna] == " ":
                tablero[fila][columna] = "X"
            else:
                print("Posicion ya ocupada")
                turno -=1
    
    if gano(tablero, "O"):
        print(f"Enbuenahora!!!... Gano jugador 'O': {jugador_O}!!!")
        historial.append(jugador_O)
    elif gano(tablero, "X"):
        print(f"Enbuenahora!!!... Gano jugador 'X': {jugador_X}!!!")
        historial.append(jugador_X)
    else:
        print("Empate")
        historial.append("Empate")

    imprimir(tablero)
    print("Historial de partidas: ")
    for partida in historial:
        print(partida)