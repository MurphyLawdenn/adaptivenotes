package com.example.adaptivenotes

data class Note(val id: Int, val title: String, val text: String)

val sampleNotes = listOf(
    Note(1, "Перша нотатка", "Це приклад нотатки."),
    Note(2, "Завдання", "Купити молоко, зарядити ноутбук."),
    Note(3, "Ідея проєкту", "Розробити трекер звичок з Compose."),
    Note(4, "Книги", "Дочитати «Clean Architecture» Боба Мартіна."),
    Note(5, "Спорт", "Тренування в середу о 18:00.")
)
