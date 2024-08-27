
def fibonacci(n:int):
    if n == 1 or n == 0:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)

if __name__ == "__main__":
    print("Ingrese un valor: ")
    x = int(input())
    print(f"f({x}) = {fibonacci(x)}")


