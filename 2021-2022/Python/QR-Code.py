import qrcode

print("Inserisci il Link del sito che vuoi fare divetare QRCode")
link = input()
link = "'{}'".format(link)
print(link)
print("Inserisci il nome che vuoi dare al QRCode")
img = qrcode.make(link)
img.save('MyQRCode')