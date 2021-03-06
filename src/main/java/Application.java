import java.util.Random;

/**
 * В строку аргумента знак зодиака вводить:
 * -на русском языке;
 * -с маленькой буквы.
 **/
public class Application {
    public static void main(String[] args) {
        arg(args);
    }

    public static void arg(String[] args) {
        if (args[0].equals("овен")) {
            System.out.println("Выбранный знак зодиака - овен");
            aries();
        }
        else if (args[0].equals("телец")) {
            System.out.println("Выбранный знак зодиака - телец");
            taurus();
        }
        else if (args[0].equals("близнецы")) {
            System.out.println("Выбранный знак зодиака - близнецы");
            gemini();
        }
        else if (args[0].equals("рак")) {
            System.out.println("Выбранный знак зодиака - рак");
            cancer();
        }
        else if (args[0].equals("лев")) {
            System.out.println("Выбранный знак зодиака - лев");
            leo();
        }
        else if (args[0].equals("дева")) {
            System.out.println("Выбранный знак зодиака - дева");
            virgo();
        }
        else if (args[0].equals("весы")) {
            System.out.println("Выбранный знак зодиака - весы");
            libra();
        }
        else if (args[0].equals("скорпион")) {
            System.out.println("Выбранный знак зодиака - скорпион");
            scorpio();
        }
        else if (args[0].equals("стрелец")) {
            System.out.println("Выбранный знак зодиака - стрелец");
            sagittarius();
        }
        else if (args[0].equals("козерог")) {
            System.out.println("Выбранный знак зодиака - козерог");
            capricorn();
        }
        else if (args[0].equals("водолей")) {
            System.out.println("Выбранный знак зодиака - водолей");
            aquarius();
        }
        else if (args[0].equals("рыбы")) {
            System.out.println("Выбранный знак зодиака - рыбы");
            pisces();
        }
        else System.out.println("В выборе знака зодиака допущена ошибка");
    }

    public static void aries(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Не отступайте от правил сегодня, даже если вы очень спешите. В последствии к вам могут здорово придраться, используя это как основание.");
        }
        else System.out.println("Сегодня обычно свойственная вам застенчивость будет забыта. Вы удивитесь, насколько легко вам будет заговорить с незнакомцем как со старым другом. Возможно, вы приобретете новых друзей.");
    }
    public static void taurus(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Не стоит ограничивать ничью свободу, это не возымеет желаемого действия, а лишь озлобит человека. Вам никто ничего не должен.");
        }
        else System.out.println("Новые и весьма полезные проекты остановятся в своем развитии исключительно по причине отсутствия связи, или недостаточной ее интенсивности. Озаботьтесь решением этой задачи.");

    }
    public static void gemini(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("События разворачиваются несколько быстрее, чем вам хотелось бы. Сегодня у вас может появиться желание заупрямиться - не поддавайтесь ему, это только подольет масла в и без того здорово чадящее пламя.");
        }
        else System.out.println("Сегодня вам категорически противопоказаны спешка и азарт. И то и другое может довести вас до весьма плачевного состояния.");

    }
    public static void cancer(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Вы подобно волшебному фонарю проецируете на все и вся собственное видение жизни, и крайне удивляетесь, когда кто-то начинает громко протестовать. Прислушайтесь к чему-нибудь кроме самого себя.");
        }
        else System.out.println("Сегодня вы, возможно, попадете в ситуацию, когда лучшим выходом будет отступление. Упрямством ничего добиться не удастся.");

    }
    public static void leo(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Сегодня ничто не будет преграждать вашего пути. Если вы не остановитесь сами, рискуете зайти слишком далеко. Раскаиваться придется через довольно продолжительный промежуток времени.");
        }
        else System.out.println("Сегодня вам, возможно, придется не раз менять свое мнение по тому или иному поводу. Так что лучше не торопиться его высказывать.");
    }
    public static void virgo(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Все, что сегодня будет происходить, следует внимательно рассмотреть и тщательно осмыслить, ибо это будет иметь немаловажное значение в самое ближайшее время.");
        }
        else System.out.println("Сегодняшний день будет удачен для всякого рода встреч и разговоров - от приятных дружеских бесед ни о чем и сплетен, до деловых переговоров.");

    }
    public static void libra(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Сегодня как раз тот день, про который вы в последствии скажете \"Не было бы счастья, да несчастье помогло\". Что бы нынче ни случилось - хэппи энд вам обеспечен.");
        }
        else System.out.println("Сегодня преуспеет тот, кто способен не только читать, но и писать между строк, причем, желательно, без ошибок.");

    }
    public static void scorpio(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Сегодняшний день, конечно, предназначен для отдыха, но, чтобы мозги не заржавели, выберите какой-нибудь интеллектуально-активный его вариант. Шахматы... Нет, сложно. Кроссворд порешать можете?");
        }
        else System.out.println("Сегодня вы вновь получите возможность приняться за когда-то отложенное дело. И, что самое интересное, оно пойдет.");

    }
    public static void sagittarius(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Вы склонны впадать в солипсизм, а этого, пожалуй делать не стоит. Окружающие иногда обижаются, когда им даешь понять, что они - лишь игра вашего воображения. Даже если это так - зачем же их огорчать?");
        }
        else System.out.println("Грядущие перемены либо не затронут вас, либо изменят ваше положение к лучшему. Не сопротивляйтесь им.");

    }
    public static void capricorn(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Исчерпайте имеющиеся у вас возможности, прежде, чем искать новые. В противном случае можете лишиться и тех, что у вас были, и не получить других.");
        }
        else System.out.println("Сегодня вы будете знать ответы на все вопросы. Будьте же благосклонны к окружающим, не скрывайте от них своего знания.");

    }
    public static void aquarius(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Сегодня вы будете видеть и слышать только то, что хотели бы. Это, конечно, здорово, но к вечеру лучше вернуться в реальный мир.");
        }
        else System.out.println("Сегодня вы можете слегка сбиться с курса. Ничего особо страшного вам не грозит, это обернется лишь забавным приключением, которое, правда, может оказаться несколько дороговатым.");
    }
    public static void pisces (){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("Над вами зависла некоторая угроза, опасность которой можно предотвратить, если заняться этим вопросом немедленно. Тихо забиться в угол, дабы смиренно ожидать расплаты за ошибки вы всегда успеете.");
        }
        else System.out.println("Сегодня вам ни в коем случае нельзя идти напролом. Проломать-то проломаете, а дальше что? Если вы не в состоянии соответствующим образом извернуться, лучше подождите.");
    }
}

