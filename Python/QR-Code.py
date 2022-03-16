import qrcode

img = qrcode.make(
    'http://lestanzedielle.it/'
)
img.save('MyQRCode.png')