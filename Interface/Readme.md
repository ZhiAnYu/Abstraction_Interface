Задание 2 (обязательное)
Перед вами интерфейс Logger, описывающий объекты, умеющие логировать, т. е. журналировать сообщения из программы. В нашем случае журналом будет консоль:

public interface Logger {
    void log(String msg);
}
Напишите две реализации этого интерфейса: SimpleLogger и SmartLogger.

Логгер типа SimpleLogger при вызове метода log должен выводить на экран текст вида: [2022-12-17T19:04:28.907390] <сообщение>, где в квадратных скобках указаны точная дата и время вызова метода. Его можно получить с помощью LocalDateTime.now(), возвращённый этой командой объект можно напрямую склеивать с текстом через +.

Логгер типа SmartLogger должен иметь текст вида INFO#13 [2022-12-17T19:04:28.907390] <сообщение>. Вместо 13 следует указать порядковый номер вызова метода log у этого логгера (нумеровать с 1). В случае, если в сообщении есть слово error (всё равно в каком регистре), то INFO следует заменить на ERROR.
