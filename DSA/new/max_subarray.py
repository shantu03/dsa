
str=input()

p=str.split(",")
k=p[0].split("[")
p[0]=k[1]

k=p[len(p)-1].split("]")
p[len(p)-1]=k[0]

kk=(int)[]

for i in range(len(p)):
	if(i==0):
		
	kk.append(int(p[i]))
	print(type(p[i]))

print(kk)