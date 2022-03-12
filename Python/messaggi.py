print("Inserisci la parola da riptere")
a=input()
print("Inserisci il numero per quante volte deve ripetere: "+a)
b=int(input())
for i in range(b):
    print(a+" "+str(i+1))