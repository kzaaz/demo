<html>
<head>
    <meta charset="utf-8">
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" method="post" action="/person/save">
                <div class="form-group">
                    <label>姓名</label>
                    <input name="personName" type="text" class="form-control" value="${(person.personName)!''}" />
                </div>
                <div class="form-group">
                    <label >年龄</label>
                    <input name="age" type="text" class="form-control" value="${(person.age)!''}" />
                </div>
                <input hidden type="text" name="id" value="${(person.id)!''}">
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>