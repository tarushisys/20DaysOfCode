
for n in range(1,151):
    if n%5==0:
        print("TIP")
    elif n%7==0:
        print("TOP")
    elif n%5==0 and n%7==0:
        print("TIPTOP")
    else:
        print(n)