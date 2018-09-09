const path = require('path')
module.exports = {
  entry: path(__dirname, 'src/index.js'),
  output: {
    filename: 'bundle.js',
    path: path.join(__dirname, 'dist')
  }
}