Завершите работу над кодом финансового приложения — соберите в отдельный класс код, касающийся трат пользователя. Назовите этот класс ExpensesManager (англ. «менеджер по расходам») и опишите его, действуя по пунктам:
Объявите одно поле — массив трат double[] expenses.
Объявите конструктор без параметров, а внутри него инициализируйте массив так же, как это происходит сейчас в классе Main, — в нём должно храниться семь значений.
Перенесите в ExpensesManager код методов saveExpense, findMaxExpense и printAllExpenses. Удалите перед названием методов слова public и static.
В классе Main должно остаться взаимодействие с пользователем — печать меню, вопросов пользователю, а также считывание его ответов: команд, значений зарплаты, дней и трат.
Параметры метода saveExpenseвнутри класса ExpensesManager изменятся: теперь он должен принимать остаток на счёте moneyBeforeSalary, размер траты expense и номер дня недели day, за который нужно её учесть.
Уберите из методов findMaxExpense и printAllExpenses параметр double[] expenses. Теперь он стал полем класса, и его не нужно передавать.
Создайте объект класса ExpensesManager и вызовите его методы внутри класса Main.