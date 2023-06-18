package ru.uzbekovve.autopl.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.uzbekovve.autopl.ui.screens.main.MainViewModel

fun mainScreenModule() = module {
    viewModel {
        MainViewModel()
    }
}