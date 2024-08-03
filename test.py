# # def cut_cake(a,b,c):
# #     for i in range(1, 100):
# #         if(a % i == 0 and b % i == 0 and c % i == 0):
# #             d = []
# #             d.append(i) 
                     
# #         print(d) 
# # a= int(input('Nhập số a:'))
# # b= int(input('Nhập số b:'))
# # c= int(input('Nhập số c:'))    
# # cut_cake(a,b,c)    
# def Sum():
#     a = [2, 3, -5, -2, 0, -3, 6]
#     c = []

#     for i in a:
#         for j in a:
#             for x in a:
#                 if(i + j + x == 0):
#                    if(i != j and j != x and x != i):
                       
#                            c.append(i)
#                            c.append(j)
#                            c.append(x)
                           
#     def chia_cum_mang():
#        return [c[i:i+3] for i in range(0, len(c), 3)]
#     print(chia_cum_mang())
# Sum()
# def sap_xep_nhanh(mang):
#     if len(mang) <= 1:
#         return mang
#     chot = mang[0]
#     trai = [x for x in mang if x < chot]
#     giua = [x for x in mang if x == chot]
#     phai = [x for x in mang if x > chot]
#     return sap_xep_nhanh(trai) + giua + sap_xep_nhanh(phai)

# mang = [3, 6, 8, 10, 1, 2]
# print("Mảng ban đầu:", mang)
# mang_da_sap_xep = sap_xep_nhanh(mang)
# print("Mảng đã sắp xếp:", mang_da_sap_xep)
# Nhập kích thước của mảng
# rows = int(input("Nhập số hàng: "))
# cols = int(input("Nhập số cột: "))

# # Khởi tạo mảng hai chiều rỗng
# matrix = []

# # Nhập các phần tử của mảng
# for i in range(rows):
#     row = []
#     for j in range(cols):
#            element = "*"
           
        
#            row.append(element)
    
#     matrix.append(row)

# # In mảng hai chiều
# print("Mảng hai chiều đã nhập:")
# for row in matrix:
#     print(row)

# Nhập chiều cao của tam giác
# height = int(input("Nhập chiều cao của tam giác: "))

# # In tam giác đều
# for i in range(1, height + 1):
#     if(i == 1):
#         print('*' * (2 * i - 1))
#     elif(i == 2):
#         print('*' * (2 * i - 2))
#     elif(i == 3):
#         print('*' * (2 * i - 3))
    

    
# Sử dụng thư viện math để thực hiện các phép toán
# Vẽ hình trái tim
# for row in range(6):
#     for col in range(7):
#         if (row == 0 and col % 3 != 0) or (row == 1 and col % 3 == 0) or (row - col == 2) or (row + col == 8):
#             print("* ", end="")
#         else:
#             print("  ", end="")
#     print()
# a = []
# n = int(input('Nhập n:'))
# for i in range(0, n):
#     i = int(input(f'Nhập từng phần tử thứ {i} vào dãy:'))
#     a.append(i)
# x = int(input('Nhập số thứ tự muốn loại bỏ:'))
# del a[x]

# for i in a:
#     print(i, end=" ")
def fill_base(base, second_level):
    # Điền giá trị vào mảng base dựa trên tầng trên biết trước
    n = len(base)
    
    # Nếu phần tử đầu tiên đã biết
    if base[0] is not None:
        for i in range(n - 1):
            if second_level[i] is not None and base[i + 1] is None:
                base[i + 1] = second_level[i] - base[i]
    
    # Nếu phần tử cuối cùng đã biết
    if base[-1] is not None:
        for i in range(n - 1, 0, -1):
            if second_level[i - 1] is not None and base[i - 1] is None:
                base[i - 1] = second_level[i - 1] - base[i]
                
    # Điền giá trị từ trái sang phải
    for i in range(n - 1):
        if second_level[i] is not None and base[i] is None and base[i + 1] is not None:
            base[i] = second_level[i] - base[i + 1]
        elif second_level[i] is not None and base[i] is not None and base[i + 1] is None:
            base[i + 1] = second_level[i] - base[i]
    
    return base

# Tầng dưới cùng có 7 phần tử với một số đã biết
base = [8, None, None, None, None, None, None]

# Tầng tiếp theo có 5 phần tử với các số đã biết
second_level = [19, None, 19, None, 20]

# Điền các số vào các ô trống ở tầng dưới cùng
filled_base = fill_base(base, second_level)

# In ra tầng dưới cùng sau khi đã điền các số vào các ô trống
print(filled_base)
