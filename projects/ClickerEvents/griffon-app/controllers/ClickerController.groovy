class ClickerController {

    def model
    def counterService
	
    def action = { 
        app.event("Click", [counterService.next])
    }

    def onClick = { value ->
        doLater { model.message = "Count: $value" }
    }
}
