********************************************
<#-- 测试命名空间 -->
<#import "import.ftl" as cc />
<@cc.copyright date="1999-09-09" />
	${cc.mail}
--------------------------------------------
这样可以覆盖引用文件中定义的值
<#assign mail="my@163.com" in cc />
	${cc.mail}
********************************************