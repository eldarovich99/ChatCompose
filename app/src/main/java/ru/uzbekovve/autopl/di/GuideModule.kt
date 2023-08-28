package ru.uzbekovve.autopl.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.uzbekovve.autopl.ui.screens.guide.GuideViewModel

fun guideModule() = module {
    viewModel {
        GuideViewModel()
    }
}
