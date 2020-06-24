<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Hello World!</title>
</head>
<body>

<table>
    <tr>
        <td>序号</td>
        <td>文章</td>
    </tr>
          <#list informationList as information>
    <tr>
        <td>${information_index + 1}</td>
        <td>${information.fTitle}</td>

    </tr>
</#list>

</table>