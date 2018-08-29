package integration.pages

import geb.Page

class ZMainPage extends Page {
    static url = 'http://localhost:7000/'
    static at = { title == "PetClinic :: a Spring Framework demonstration" }
    static content = {
        heading { $("h1").text() }
    }
}
