### GeekBrains_Course_JavaCoreForAndroid_HW_Lesson_2_v2
---
### Домашняя работа к занятию №2
Студента GeekBrains ***Веремеенко Дмитрия***    
Факультет: ***Android-разработки***    
Курс: ***Java Core для Android***    
### Задание:
---
- [X] ***Задача №1.***	Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0.    
- [X] ***Задача №2.***	Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.    
- [X] ***Задача №3.***	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.    
- [X] ***Задача №4.***	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнитьего диагональные элементы единицами.    
- [X] ***Задача №5.***	*Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета).    
- [ ] ***Задача №6.***	*Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.    
- [ ] ***Задача №7.***	*Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться 
вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.    
        
### Отчет о выполнении:
---    
:heavy_check_mark: ***Задача №1.***	Задание выполнено. Решил все задачи выполнить с применением отдельных методов,
а не в main. Для тренировки. Несколько удивился поведению массива как ссылочного типа данных, когда передал его в качестве
аргумента метод. Я искренне считал, что метод работает и изменяет локальную версию (копию) массива.
На самом деле оказалось не так. И работая с массивом в методе я также воздействовал на элементы массива, как если бы
работал с ним напрямую из main. В итоге это натолкнуло на мысль, чуть больше с этим вопросом разобраться.
В текущей домашней работе использовать это свойство с пользой. Таким образом, разрабатывая метод работы с массивом,
фактически мне не нужно делать метод возвращающим значение его возвращать, все уже сделано.
Метод оставил возвращающим значение int[] (хоть IDE и рекомендует переделать его на void) и реализовал два способа 
решения задачи, обращаясь к методу как к процедуре и как к функции, возвращающей значение.
Один способ закомментировал в коде.    
:heavy_check_mark: ***Задача №2.***	Задание выполнено. В задании четко прослеживается арифметическая последовательность.
Поэтому было принято решение, в качестве тренировки, разработать более общее решение метода, создающего одномерный 
массив любой длины, и наполняющего его значениями начиная с некоего значения первого элемента с определенным 
шагом приращения. Результат работы метода *getArithmeticProgression(int, int, int)* показан вызовом его в main.   
:heavy_check_mark: ***Задача №3.***	Задание выполнено. Разработан метод позволяющий в цикле просмотреть весь передаваемый
в качестве параметра массив, и те элементы значение которых оказывается меньше порогового значения,
передаваемого в качестве второго параметра, удваиваются. При выполнении данного задания, немного изменен метод вывода 
элементов массива в консоль, вместо пробела между элементами добавлена табуляция. Это решение позволило нагляднее выводить 
оригинальный и измененный массив друг под другом выравнивая тем самым значения ячеек друг напротив друга.    
:heavy_check_mark: ***Задача №4.***	Задание выполнено. Немного не разобрался в задании, какую именно диагональ в квадратном
массиве заполнять. В итоге создал универсальный метод создающий квадратную матрицу заданного размера и по желанию
заполняет как главную, так и побочную диагонали. Чем заполнять тоже можно выбрать, передавая в метод значение заполнения.
Так можно сделать как единичную матрицу, скалярную и заполнить обе диагонали любыми значениями (целые числа тип int).
Дополнительно опробован принцип перегрузки методов. Так для создания единичной матрицы нужного размера, в метод нужно
передать только размер матрицы. Три примера работы метода приведены в main.    
:heavy_check_mark: ***Задача №5.***	Задание выполнено. Созданы два метода, которым передается для анализа одномерный 
массив целых чисел. Возвращаемые значение типа int являются максимальным и минимальным значением всех элементов 
переданного массива. Пример работы методов приведен в main.    
:clock2: ***Задача №6.***	 - выполняется -     
:clock2: ***Задача №7.***	 - выполняется -      
   
   
---   

*StDimensiy 05.02.2021*
