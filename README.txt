Здравствуй!
Это программа розыгрыша призов/игрушек

Начинается программа с меню, где тебе будет доступен выбор:

    - Добавить новый розыгрываемый объект(в моем исполненни это игрушки)
        Тут надо будет ввести название этого объекта и колл-во этих объектов.
        Каждому объекту будт присвоет уникальный идентификатор (UUID) из 13 символов (для краткости).
        Так же каждый объект будет добавлен в список объектов, которые впоследствии будут разыграны.

    - Меню розыгрыша призов. Тут так же будет доступно небольшое меню:
        -- Разыграть беспроигрышную лоттерею (Каждый участник получит приз)
        -- Или лоттерея с шансом выиграть приз - 20 % (Щедрая лоттерея, не правда ли? :-) )
        -- Посмотреть список призов которые будут разыграны.
        -- Вернуться назад в основное меню

    - Выйти из прграммы

Участники лоттереи генерируются. C помошью файфлов "names.txt", "secondNames.txt" им создаются имена и фамилии соответственно.
Так что победители в этой лоттереи вымышлены (а это уже похоже на настоящую лоттерею, не правда ли? :-) )
Счастливчики, кому достанется приз будут записанны в файл "Winners.txt", где будут указанны их имена и фамилии и какая конкретно игрушка(по UUID) им досталась.
