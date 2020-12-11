minxing-java-sdk
================

Minxing sdk for java



#简单的例子


发送信息给某个用户的例子。
```txt

AppAccount account = AppAccount.loginByToken("http://localhost:3000",
				"yh5EgUi0rV51l2_s0oZ6Q45nd8zWdgUqiyxiLgwEDtzPmNVy"); //使用token登录
// account.setFromUserId(30766);
account.setFromUserLoginName("13911759994");

// 发送消息给莫个人

User a = new User();
a.setLoginName("oajcs3@js.chinamobile.com");

TextMessage message = account.sendMessageToUser(a, "一条个人消息2");
System.out.println(message);
				
```

###注意事项

* 请勿在提交的SDK代码及测试样例中,留有任何客户环境的地址参数

###2017年5月27日###
=
增加新接口 kick2 - 将在线的人踢下线


# 2018年2月27日
```text
1、sdk增加生日字段的更新功能
```


# 2018年7月27日
```text
1、分支6.0.2是由6.0.1分支检出的
2、增加移动考勤更新下班打卡时间的接口
```

# 6.0.1 - 2018年8月30日
```text
1、增加第三方批量打标签接口 - 需要依赖敏行6.6.0.02版本
2、增加第三方获取全部标签接口 - 需要依赖敏行6.6.0.02版本
```
# 6.0.1 - 2018年9月21日
```text
1、禁用用户接口 - 需要依赖敏行6.6.0.02版本
2、公众号同步轮播图&删除文章&修改文章接口 - 需要依赖敏行6.6.0.02版本

```

# 8.0.0 - 2020年3月13日
```text
本分支基于6.8.2衍生
1.修改推送时 title字段和description字段使用unicode编码的问题(非中文编码 转换的unicode导致json格式错误)
  已经将两个字段修改为不使用unicode编码
2.build.xml将版本号更新至8.0.0

```
