## Калькулятор на Java
Это простое консольное приложение на Java, которое демонстрирует основные арифметические операции с использованием интерфейсов и полиморфизма.

### Описание
Проект включает в себя несколько классов, реализующих различные математические операции (сложение, вычитание, умножение, деление) через общий интерфейс Operation. Класс Calculator используется для выполнения операций с выводом результатов в консоль с помощью класса OperationView.

### Классы и интерфейсы
Operation: Интерфейс, определяющий метод execute(double a, double b), который должен быть реализован в каждой конкретной математической операции.
Addition, Subtraction, Multiplication, Division: Классы, реализующие интерфейс Operation для соответствующих математических операций.
Calculator: Класс, использующий экземпляр OperationView для вывода результатов операций.
OperationView: Класс, который обеспечивает вывод операций в консоль и логгирование с использованием java.util.logging.Logger.

### Принципы SOLID
1. **Принцип единственной ответственности (Single Responsibility Principle)**

- Классы Addition, Subtraction, Multiplication, Division соответствуют принципу единственной ответственности, поскольку каждый из них реализует только одну конкретную математическую операцию, определенную интерфейсом Operation.

- Класс OperationView также соответствует принципу единственной ответственности, так как его основная задача - обеспечить вывод результатов операций в консоль и логгирование.

2. **Принцип открытости/закрытости (Open/Closed Principle)**
- Код приложения поддерживает принцип открытости/закрытости, так как новые операции можно легко добавлять, не изменяя существующий код Calculator или OperationView. Для добавления новой операции достаточно создать новый класс, реализующий интерфейс Operation.
3. **Принцип подстановки Барбары Лисков (Liskov Substitution Principle)**
- Классы Addition, Subtraction, Multiplication, Division могут быть использованы вместо интерфейса Operation без изменения поведения программы. Это означает, что любой экземпляр класса, реализующего Operation, может быть передан в метод performOperation класса Calculator, и программа будет работать корректно.
4. **Принцип разделения интерфейса (Interface Segregation Principle)**
- Интерфейс Operation прост и содержит только один метод execute, что соответствует принципу разделения интерфейса. Каждая конкретная операция реализует только необходимый для неё функционал, минимизируя зависимости от ненужных методов.
5. **Принцип инверсии зависимостей (Dependency Inversion Principle)**
- Класс Calculator зависит от абстракции (Operation интерфейса), а не от конкретной реализации операций (Addition, Subtraction, Multiplication, Division). Это позволяет легко внедрять новые операции и изменять их поведение без изменения кода Calculator.

### Как запустить
Для успешного запуска приложения необходимо убедиться, что у вас установлены следующие компоненты:

1. Java Development Kit (JDK): Приложение разработано на Java, поэтому для компиляции и запуска требуется JDK. Вы можете скачать JDK с официального сайта Oracle или OpenJDK.

2. Git: Для клонирования репозитория и загрузки исходных файлов вам также потребуется Git. Вы можете скачать Git с официального сайта Git.

### Шаги для запуска
1. Склонируйте репозиторий:
git clone https://github.com/your/repository.git
cd repository-name

2. Скомпилируйте исходные файлы:
javac *.java

3. Запустите главный класс Main:
java Main