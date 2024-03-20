import math
def coppia(a, b):
    return float(str(a) + "." + str(b))

global key_priv, key_pub, n, n_pub, n_priv
def generatore_chiavi():
    global key_priv, key_pub, n, n_pub, n_priv
    p = int(input("Inserisci il primo numero per generare la chiave "))
    q = int(input("Inserisci il secondo numero per generare la chiave "))
    n = p*q
    v = (p - 1)*(q - 1)
    while True:
        n_priv = int(input("Inserisci un numero in modo che non abbia fattori in comune con " f'{v} '))
        if math.gcd(n_priv, v) == 1:
            print("Non hanno fattori in comune")
            break
        else:
            print("hanno fattori in comune")
    n_pub = int(input("Inserisci numero chiave pubblica "))
    if (n_priv * n_pub)%v == 1:
        print("ecco le tue chiavi")
        key_priv = coppia(n, n_priv)
        key_pub = coppia(n, n_pub)
        print("chiave privata " f'{key_priv} ')
        print("chiave pubblica " f'{key_pub}')
    return None

def cifratore(m):
    return int((pow(m, n_pub))%n)

def decifratore(m):
    return None


generatore_chiavi()
messaggio = int(input("Inserisci il numero da trasmettere "))
cifrato = cifratore(messaggio)
print(cifrato)

