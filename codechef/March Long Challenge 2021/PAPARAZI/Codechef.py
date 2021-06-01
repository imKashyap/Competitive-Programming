# cook your dish here
try:
    for i in range(int(input())):
        n=int(input())
        a=[int(i) for i in input().split()]
        if n<=2:
            print(1)
        else:
            ans=-1
            newa=[]
            for i in range(n):
                newa.append([i,a[i]])
            b=[]
            b.append(newa[0])
            b.append(newa[1])
            l=len(b)
            for i in range(2,n):
                while(len(b)>=2):
                    slope1=(b[l-1][1]-b[l-2][1])/(b[l-1][0]-b[l-2][0])
                    slope2=(newa[i][1]-b[l-1][1])/(newa[i][0]-b[l-1][0])
                    if slope2>=slope1:
                        b.pop()
                        l-=1
                    else:
                        break
                b.append(newa[i])
                l+=1
                ans=max(ans,(b[l-1][0]-b[l-2][0]))
            print(ans)
except:
    pass
