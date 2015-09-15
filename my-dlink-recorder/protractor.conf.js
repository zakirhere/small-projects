
exports.config = {

    capabilities: {
      'browserName': 'chrome',
      'chromeOptions': {
//        'args': ['--load-extension=' + "C:\\Temp\\1.0.1.8_0"]
        'args': ['--load-extension=' + "C:\\Temp\\1.0.1.8_0", '--user-data-dir=C:/ChromeProfile'], // start with pre-configured Chrome profile
        'excludeSwitches': ['disable-component-update'] // stop breaking Native Client support
      },
      'excludeSwitches': ['disable-component-update']
    },

  seleniumAddress: 'http://localhost:4444/wd/hub',
  jasmineNodeOpts: {
        defaultTimeoutInterval: 9999999
  },
  specs: ['reload-page.spec.js']
};