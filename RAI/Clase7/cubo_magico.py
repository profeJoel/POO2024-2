def es_cubo_magico(m):
    s_f_0 = 0 
    s_f_1 = 0 
    s_f_2 = 0
    s_c_0 = 0 
    s_c_1 = 0 
    s_c_2 = 0
    s_d_p = 0 
    s_d_s = 0 
    for i in range(3):
        for j in range(3):
            if i == 0: 
                s_f_0 += m[i][j]
            if i == 1: 
                s_f_1 += m[i][j]
            if i == 2: 
                s_f_2 += m[i][j]

            if j == 0: 
                s_c_0 += m[i][j]
            if j == 1: 
                s_c_1 += m[i][j]
            if j == 2: 
                s_c_2 += m[i][j]

            if i == j: 
                s_d_p += m[i][j]
            if i+j == 2: 
                s_d_s += m[i][j]
    
    if s_f_0 == s_f_1 and s_f_1 == s_f_2 and s_f_2 == s_c_0 and s_c_1 == s_c_2 and s_c_2 == s_d_p and s_d_p == s_d_s:
        return True
    else:
        return False
                

if __name__ == "__main__":
    #vector = [int] * 5

    #matriz = [[int] * 5] * 5

    matriz = [[1,2,1],[1,1,1],[1,1,1]] # forma explicita

    for i in range(3):
        for j in range(3):
            print(f"{matriz[i][j]} ", end="")
        print("")
    
    if(es_cubo_magico(matriz)):
        print("Si es cubo magico")
    else:
        print("No es cubo magico")