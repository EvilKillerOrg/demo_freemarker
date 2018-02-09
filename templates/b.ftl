********************************************
<#-- 测试macro宏指令 (类似定义了一个方法m1) -->
定义宏:
<#macro m1>
	<b>aaaaaaaaaaaaaa</b>	
	<b>bbbbbbbbbbbbbb</b>	
</#macro>
--------------------------------------------
定义带参数的宏
<#macro m2 arg1 arg2 arg3>
	${arg1} -- ${arg2} -- ${arg3}
</#macro>
--------------------------------------------
调用宏: (可以多次调用)
<@m1 /> <@m1 /> 
<@m2 "二球" "二货" "二逼" /> 
<@m2 "老球" "老货" "老逼" />
********************************************
<#-- 测试nested嵌套指令 -->
<#macro border>
	<table border=4, cellspacing=0, cellpadding=4>
		<tr>
			<td>
				<#nested>
			</td>
		</tr>
	</table>
</#macro>

<@border>
	这里就在两个td中间出现了
</@border>
********************************************
<#-- 函数 -->
<#--
<#function buildPageUrl url pageNum data>
	<#assign pageUrl = "${url}?pageNum=${pageNum}&pageSize=${data.pageSize}">
    <#return pageUrl/>
</#function>
-->
********************************************
<#-- 测试定义变量 (相当于c:set) -->
<#assign mail = "evil_killer@126.com" />
${mail}
--------------------------------------------
特殊变量 .main
<#-- 

-->
********************************************
<#-- 测试数据类型 -->
<#-- 
	<#assign aaa = "evil_killer" />	字符串
	<#assign aaa = 123 /> 数字
	<#assign aaa = false /> 布尔值
	<#assign aaa = [1,2,3,4,5] /> 集合; 取用索引:${aaa[0]}, 支持这样用索引:${aaa[1..3]}取索引1到3的,${aaa[2..]}取2到结束的子集
	<#assign aaa = {"a":"aa" , "b":11} /> Map(类似json); 取值就是用key: aaa.a或aaa["a"]
-->
********************************************
<#-- 测试日期格式化 -->
<#--
	{data1?string("yyyy-MM-dd HH:mm:ss")} 时间格式化
-->
********************************************
<#-- freemarker处理空值 -->
<#--
	${ssss}  这个没定义 会报错freemarker处理不了
	${ssss!}  这样加个默认值,默认值是空字符串
	${ssss!"abc"}  这样加个默认值,默认值是abc
-->
--------------------------------------------
??运算符判断是否存在返回布尔值
<#--
 	<#if user??> <h1>Welcome ${user} !</h1> </#if>  (相当于user!=null)
-->
********************************************
