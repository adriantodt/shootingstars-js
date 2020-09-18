import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.events.EventListener
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.url.URLSearchParams

fun main() {
    window.addEventListener("load", EventListener { onLoad() })
}

fun onLoad() {
    setupLogo()
}

fun setupLogo() {
    if (URLSearchParams(window.location.search).has("logo")) {
        PixelatedLogo().setup(document.getElementById("c") as HTMLCanvasElement, "img/adriantodt.png.txt")
    } else {
        ShootingStars().setup(document.getElementById("c") as HTMLCanvasElement)
    }
}
