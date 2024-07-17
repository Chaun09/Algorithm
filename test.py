def array():
    a = []
    n = int(input('Nhap so phan tu trong mang:'))
    k = int(input('Nhap vao vi tri k'))
    x = int(input('Nhap vao so nguyen x'))

    for i in range(1, n):
        # i = input('nhap tung phan tu vao day')
        i+1

        a.append(i)
        
    a.insert(k, x)
    print(a)        

    

array()

