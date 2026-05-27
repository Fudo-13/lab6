# Лабораторная работа №6

## Тема

Spring MVC для Web-разработки.

## Цель работы

Перевести Web-приложение магазина зоотоваров на Spring MVC, реализовать REST API и Web-интерфейс для работы с заказами.

## Что сделано

Проект настроен для работы со Spring MVC. Для обработки запросов используется `DispatcherServlet`, конфигурация описана в Java-классах `WebConfig` и `WebAppInitializer`.

Реализована работа с заказами:

- просмотр списка заказов;
- получение заказа по идентификатору;
- создание заказа;
- изменение заказа;
- удаление заказа.

REST API реализован в классе `OrderRestController`.  
Web-интерфейс реализован через `OrderController` и шаблоны Thymeleaf.

## REST API

```text
GET    /api/orders
GET    /api/orders/{id}
POST   /api/orders
PUT    /api/orders/{id}
DELETE /api/orders/{id}
