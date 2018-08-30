package integration.pages

import geb.Page

class ZOwnersPage extends Page {
    static url = 'http://localhost:7000/owners'
    static at = { title == "PetClinic :: a Spring Framework demonstration" }
    static content = {
        heading { $("h2").text() }
    }
}
