import pandas as pd
import random
a=['赵','钱','孙','李','周','吴','郑','王','冯','陈','褚','卫','蒋','沈','韩','杨','朱','秦','尤']
b=['昌','马','苗','凤','花','方','俞','任','袁','柳','酆','鲍','史','邹','喻']
c=['柏','水','窦','章','云','苏','潘','葛','奚','范','彭','郎','鲁','韦''贺','倪','汤','滕','殷','罗','毕','郝','邬','安','常','乐','于','时','傅','皮']
e=[]
f=[]
g=[]
h=[]
for i in range(1,40):
    d=a[random.randint(0,len(a)-1)]+b[random.randint(0,len(b)-1)]+c[random.randint(0,len(c)-1)]
    e.append(d)

for i in range(1,40):
    f.append(random.randint(0,101))
print(f)

for i in range(1,40):
    g.append(random.randint(0,101))
print(g)

for i in range(1,40):
    h.append(random.randint(0,101))
print(h)

dict={'姓名': e, '语文': f, '数学': g, '英语': h}
df=pd.DataFrame(dict)
df.to_csv('cjd_0.csv')
df.to_csv('cjd_1.csv',index=False)