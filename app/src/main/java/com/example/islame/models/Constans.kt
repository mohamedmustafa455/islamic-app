package com.example.islame.models

abstract class Constans{

    companion object{
        val SORANAME:String="SORANAME"
        val AIATCONT:String="AIATCOUNT"
        val POSITINSORA:String="POSITION"

        val NAMEHADEETH:String="TITLE"
        val CONTENTHADEETH:String="BODY"


        val SOBHANAALLA:String =" سبحان الله "
        val ELHAMDLLALLA:String=" الحمد للة "
        val ALLAHAKBER:String=" اللة اكبر "
        val SOBHANAALLAWABEHAMDEH:String = "لا إله إلا الله وحده لا شريك له، له الملك وله الحمد وهو على كل شيء قدير"


        val soraNames = listOf<String>("الفاتحه","البقرة","آل عمران","النساء","المائدة","الأنعام","الأعراف","الأنفال","التوبة","يونس","هود"
            ,"يوسف","الرعد","إبراهيم","الحجر","النحل","الإسراء","الكهف","مريم","طه","الأنبياء","الحج","المؤمنون"
            ,"النّور","الفرقان","الشعراء","النّمل","القصص","العنكبوت","الرّوم","لقمان","السجدة","الأحزاب","سبأ"
            ,"فاطر","يس","الصافات","ص","الزمر","غافر","فصّلت","الشورى","الزخرف","الدّخان","الجاثية","الأحقاف"
            ,"محمد","الفتح","الحجرات","ق","الذاريات","الطور","النجم","القمر","الرحمن","الواقعة","الحديد","المجادلة"
            ,"الحشر","الممتحنة","الصف","الجمعة","المنافقون","التغابن","الطلاق","التحريم","الملك","القلم","الحاقة","المعارج"
            ,"نوح","الجن","المزّمّل","المدّثر","القيامة","الإنسان","المرسلات","النبأ","النازعات","عبس","التكوير","الإنفطار"
            ,"المطفّفين","الإنشقاق","البروج","الطارق","الأعلى","الغاشية","الفجر","البلد","الشمس","الليل","الضحى","الشرح"
            ,"التين","العلق","القدر","البينة","الزلزلة","العاديات","القارعة","التكاثر","العصر",
            "الهمزة","الفيل","قريش","الماعون","الكوثر","الكافرون","النصر","المسد","الإخلاص","الفلق","الناس")


        val soraData = arrayListOf<SoraDM>(
            SoraDM("الفاتحة", "7"),
            SoraDM("البقرة", "286"),
            SoraDM("آل عمران", "200"),
            SoraDM("النساء", "176"),
            SoraDM("المائدة", "120"),
            SoraDM("الأنعام", "165"),
            SoraDM("الأعراف", "206"),
            SoraDM("الأنفال", "75"),
            SoraDM("التوبة", "129"),
            SoraDM("يونس", "109"),
            SoraDM("هود", "123"),
            SoraDM("يوسف", "111"),
            SoraDM("الرعد", "43"),
            SoraDM("إبراهيم", "52"),
            SoraDM("الحجر", "99"),
            SoraDM("النحل", "128"),
            SoraDM("الإسراء", "111"),
            SoraDM("الكهف", "110"),
            SoraDM("مريم", "98"),
            SoraDM("طه", "135"),
            SoraDM("الأنبياء", "112"),
            SoraDM("الحج", "78"),
            SoraDM("المؤمنون", "118"),
            SoraDM("النور", "64"),
            SoraDM("الفرقان", "77"),
            SoraDM("الشعراء", "227"),
            SoraDM("النمل", "93"),
            SoraDM("القصص", "88"),
            SoraDM("العنكبوت", "69"),
            SoraDM("الروم", "60"),
            SoraDM("لقمان", "34"),
            SoraDM("السجدة", "30"),
            SoraDM("الأحزاب", "73"),
            SoraDM("سبأ", "54"),
            SoraDM("فاطر", "45"),
            SoraDM("يس", "83"),
            SoraDM("الصافات", "182"),
            SoraDM("ص", "88"),
            SoraDM("الزمر", "75"),
            SoraDM("غافر", "85"),
            SoraDM("فصلت", "54"),
            SoraDM("الشورى", "53"),
            SoraDM("الزخرف", "89"),
            SoraDM("الدخان", "59"),
            SoraDM("الجاثية", "37"),
            SoraDM("الأحقاف", "35"),
            SoraDM("محمد", "38"),
            SoraDM("الفتح", "29"),
            SoraDM("الحجرات", "18"),
            SoraDM("ق", "45"),
            SoraDM("الذاريات", "60"),
            SoraDM("الطور", "49"),
            SoraDM("النجم", "62"),
            SoraDM("القمر", "55"),
            SoraDM("الرحمن", "78"),
            SoraDM("الواقعة", "96"),
            SoraDM("الحديد", "29"),
            SoraDM("المجادلة", "22"),
            SoraDM("الحشر", "24"),
            SoraDM("الممتحنة", "13"),
            SoraDM("الصف", "14"),
            SoraDM("الجمعة", "11"),
            SoraDM("المنافقون", "11"),
            SoraDM("التغابن", "18"),
            SoraDM("الطلاق", "12"),
            SoraDM("التحريم", "12"),
            SoraDM("الملك", "30"),
            SoraDM("القلم", "52"),
            SoraDM("الحاقة", "52"),
            SoraDM("المعارج", "44"),
            SoraDM("نوح", "28"),
            SoraDM("الجن", "28"),
            SoraDM("المزمل", " 20"),
            SoraDM("المدثر", "56"),
            SoraDM("القيامة", "40"),
            SoraDM("الإنسان", "31"),
            SoraDM("المرسلات", "50"),
            SoraDM("النبأ", "40"),
            SoraDM("النازعات", "46"),
            SoraDM("عبس", "42"),
            SoraDM("التكوير", "29"),
            SoraDM("الإنفطار", "19"),
            SoraDM("المطففين", "36"),
            SoraDM("الإنشقاق", "25"),
            SoraDM("البروج", "22"),
            SoraDM("الطارق", "17"),
            SoraDM("الأعلى", "19"),
            SoraDM("الغاشية", "26"),
            SoraDM("الفجر", "30"),
            SoraDM("البلد", "20"),
            SoraDM("الشمس", "15"),
            SoraDM("الليل", "21"),
            SoraDM("الضحى", "11"),
            SoraDM("الشرح", "8"),
            SoraDM("التين", "8"),
            SoraDM("العلق", "19"),
            SoraDM("القدر", "5"),
            SoraDM("البينة", "8"),
            SoraDM("الزلزلة", "8"),
            SoraDM("العاديات", "11"),
            SoraDM("القارعة", "11"),
            SoraDM("التكاثر", "8"),
            SoraDM("العصر", "3"),
            SoraDM("الهمزة", "9"),
            SoraDM("الفيل", "5"),
            SoraDM("قريش", "4"),
            SoraDM("الماعون", "7"),
            SoraDM("الكوثر", "3"),
            SoraDM("الكافرون", "6"),
            SoraDM("النصر", "3"),
            SoraDM("المسد", "5"),
            SoraDM("الاخلاص", "4"),
            SoraDM("الفلق", "5"),
            SoraDM("الناس", "6")

        )




    }
}