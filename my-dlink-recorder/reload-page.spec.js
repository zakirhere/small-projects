var url_myDlink = "https://www.mydlink.com/device#28105313";
browser.ignoreSynchronization = true;

describe('After every 1 hour', function() {
    beforeEach(function() {
        browser.get(url_myDlink, 50000);
    });

    it('then refresh the current mylink page', function() {
        for(var i=0; i<5; i++) {
            refreshPage(i);
        }
    });

    function refreshPage(i) {
        browser.sleep(20000).then(function() {
            console.log('Refreshing page now: ' + i);
            browser.refresh();
        });
    }
});