<html>
<head>
    <meta charset="utf-8">
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>
                        id
                    </th>
                    <th>
                        年龄
                    </th>
                    <th>
                        姓名
                    </th>
                    <th colspan="2">
                        操作
                    </th>

                </tr>
                </thead>
                <tbody>
                <#list list as person>
                <tr>
                    <td>${person.id}</td>
                    <td>${person.age}</td>
                    <td>${person.personName}</td>
                    <td>
                        <a href="/person/update?id=${person.id}" type="button" class="btn btn-default btn-primary">修改</a>
                    </td>
                    <td>
                        <a href="/person/del?id=${person.id}" type="button" class="btn btn-default btn-primary">删除</a>
                    </td>
                </tr>
                </#list>
                </tbody>
            </table>
            <#--<button type="button" class="btn btn-lg btn-primary">-->
                <a href="/person/update" type="button" class="btn btn-default btn-primary">添加人员</a>
            <#--</button>-->
        </div>
    </div>
</div>
</body>
</html>