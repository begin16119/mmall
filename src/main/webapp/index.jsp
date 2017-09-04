<html>
<title>
    <meta charset="utf-8"/>
</title>
<body>
<h2>SpringMVC 上传文件</h2>

<form name="form1" action="/manage/product/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="SpringMVC上传文件">
</form>

<h2>富文本上传</h2>
<form name="form1" action="/manage/product/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="SpringMVC富文本上传">
</form>
</body>
</html>
