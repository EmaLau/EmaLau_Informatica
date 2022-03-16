import qrcode

img = qrcode.make(
    'https://www.youtube.com/watch?v=QzPKFfTZFj0'
)
img.save('MyQRCode.png')