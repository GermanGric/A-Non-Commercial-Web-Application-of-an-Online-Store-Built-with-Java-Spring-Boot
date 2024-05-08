<!DOCTYPE html>
<html>
<head>
    <title>OnlineStore</title>
</head>
<body>
<h1>OnlineStore</h1><hr>
<h4>Товар со всей России</h4>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<from action="/product/create" method="post">
    Название объявления: <input type="text" name="title" /><br><br>
    Описание объявления: <input type="text" name="description" /><br><br>
    Цена: <input type="number" name="price" /><br><br>
    Горо: <input type="text" name="city" /><br><br>
    Автор объявления: <input type="text" name="author" /><br><br>
    <input type="submit" value="Добавить товар"/>
</from>
</body>
</html>