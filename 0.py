import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

df=pd.read_csv('cjd_0.csv')

print(df)

# 计算平均分
avg=df['语文'].mean()
print("平均分：",avg)

# 计算总分
total=df['语文'].sum()
print("总分：",total)

# 计算最高分
max_score=df['语文'].max()
print("最高分：",max_score)

# 计算最低分
min_score=df['语文'].min()
print("最低分：",min_score)

# 计算方差
var=df['语文'].var()
print("方差：",var)

# 计算标准差
std=df['语文'].std()
print("标准差：",std)

# 计算分数段
def score_range(score):
    if score>=90:
        return "优秀"
    elif score>=80:
        return "良好"
    elif score>=60:
        return "及格"
    else:
        return "不及格"

df['分数段']=df['语文'].apply(score_range)
print(df)

# 绘制柱状图
df.plot(kind='bar',x='姓名',y='语文')
plt.show()