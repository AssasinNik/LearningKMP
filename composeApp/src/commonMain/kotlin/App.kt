import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
            ){
                Row (
                    modifier = Modifier.fillMaxWidth().padding(20.dp)
                ){
                    Text(text = "Hello Nikita",
                        modifier = Modifier.weight(1f),
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp
                        )
                    )
                    Icon(
                        Icons.Default.AccountBox,
                        contentDescription = "Icon",
                        modifier = Modifier.size(70.dp)
                    )
                }
            }
        }
    }
}