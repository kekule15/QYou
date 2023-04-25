package com.example.qyou.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.qyou.component.QuestionScreen

@Composable
fun QuestionHome(viewModel: QuestionViewModel = hiltViewModel()){
    QuestionScreen(viewModel)
}