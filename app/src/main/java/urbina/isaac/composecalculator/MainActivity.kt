package urbina.isaac.composecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import urbina.isaac.composecalculator.ui.theme.ComposeCalculatorTheme
import urbina.isaac.composecalculator.ui.theme.MediumGray
import urbina.isaac.composecalculator.ui.view.Calculator
import urbina.isaac.composecalculator.ui.viewmodel.CalculatorViewModel

// For reference: https://www.youtube.com/watch?v=-aTcFJWxEQA
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                Calculator(
                    state = viewModel.state,
                    onAction = viewModel::onAction,
                    buttonSpacing = 8.dp,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MediumGray)
                        .padding(16.dp)
                )
            }
        }
    }
}
