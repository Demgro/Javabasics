
1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

int a = 1;
int b = 2;
int c = 3;
int z = ((a - 3) * b / 2) + c;
System.out.println(z);

2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

double a = 1.;
double b = 1.;
double c = 0.;
double x = (b + Math.sqrt(b * b + 4. * a * c)) / (2. * a) - a * a * c + 1. / (b * b);
System.out.println(x);

3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

double x = Math.toRadians(45);
double y = Math.toRadians(90);
double a = Math.sin(x) + Math.cos(y);
double b = Math.cos(y) - Math.sin(x);
double c = Math.tan(x * y);
double z = a / b * c;
System.out.println(z);	

4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
Поменять местами дробную и целую части числа и вывести полученное значение числа.

double r = 123.456;
double left = (int) r;
double right = r - left;
double result = left / 1000 + (r - left) * 1000;
out.println(left);
out.println(right);
out.println(left / 1000);
out.println(r - left);
out.println((r - left) * 1000);
out.println(result);
out.println((int) r);

5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:

ННч ММмин SSc.

int t = 3600 + 60 + 1;
int h = t / 3600;
int m = (t - 3600 * h) / 60;
int s = (t - 3600 * h - 60 * m);

out.println(t);
out.println(h);
out.println(m);
out.println(s);
out.println(h + "ч " + m + "мин " + s + "с");

6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) 
принадлежит закрашенной области, и false — в противном случае:

int x = 3;
int y = 1;
if ((x > -2 && x < 3) && (y > -1 && y < 5) || (x > -5 && x < 5) && (y > -5 && y < 1)) {
	out.println(true);
} else {
	out.println(false);
}




















